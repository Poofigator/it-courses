package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BasePresenter
import java.util.*

class CalculatorPresenter(view: CalculatorView) : BasePresenter<CalculatorView>(view) {

    var x: Double = 0.0;
    var y: Double = 0.0;
    var oper: String = "";
    var answer: Double? = 0.0;
    var str: String = "";
    var before: String = "";
    var dot: Int = 0

    fun onClearClick(){
        view.showInputText("")
        view.showAnswerText("")
        var x: Double = 0.0;
        var y: Double = 0.0;
        var oper: String = "";
        var answer: Double? = 0.0;
        var str: String = "";
        var before: String = "";
        var dot: Int = 0
    }

    fun onEquallyClick() {
        view.showInputText("");
        answer = when (oper) {
            "-" -> y - x
            "+" -> y + x
            "*" -> y * x
            "/" -> y / x
            else -> null
        }
        view.showAnswerText(answer.toString());
        x = 0.0;
        y = 0.0;
        oper = "";
        str = "";
        before = "";
    }

    fun onSubClick() {
        y = x
        if (str != "" && oper == "") {
            str = str + "-"
            oper = "-"
            view.showInputText(str);
            before = str;
            str = "";
        }
    }

    fun onSumClick() {
        y = x;
        if (str != "" && oper == "") {
            str = str + "+"
            oper = "+"
            view.showInputText(str);
            before = str;
            str = "";
        }
    }

    fun onDivClick() {
        y = x;
        if (str != "" && oper == "") {
            str = str + "/";
            oper = "/";
            view.showInputText(str);
            before = str;
            str = "";
        }
    }

    fun onMultClick() {
        y = x;
        if (str != "" && oper == "") {
            str = str + "*";
            oper = "*";
            view.showInputText(str);
            before = str;
            str = "";
        }
    }

    fun onNum1Click() {
        str = str + "1";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum2Click() {
        str = str + "2";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum3Click() {
        str = str + "3";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum4Click() {
        str = str + "4";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum5Click() {
        str = str + "5";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum6Click() {
        str = str + "6";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum7Click() {
        str = str + "7";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum8Click() {
        str = str + "8";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum9Click() {
        str = str + "9";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNum0Click() {
        str = str + "0";
        x = str.toDouble();
        view.showInputText(before + str);
    }

    fun onNumDotClick() {
        for(char in str){
            if (char == '.')
            dot = 1
        }
        if (dot == 0 && str != "") {
            str = str + ".";
            x = str.toDouble();
            view.showInputText(before + str);
        }
        else dot = 0
    }
}

