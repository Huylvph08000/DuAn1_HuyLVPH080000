package com.example.duan1_huylvph08000.dictonary;

public class DictonaryPresenter implements DictonaryMVP.Presnter {
DictonaryMVP.View view;

    public DictonaryPresenter(DictonaryMVP.View view) {
        this.view = view;
    }

    @Override
    public void clickedGoHome() {
       view.goHome();
    }

}
