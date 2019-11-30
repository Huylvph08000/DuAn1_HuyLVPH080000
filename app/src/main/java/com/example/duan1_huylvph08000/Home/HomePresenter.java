package com.example.duan1_huylvph08000.Home;

public class HomePresenter implements HomeMVP.Presenter {
    HomeMVP.View view;

    public HomePresenter(HomeMVP.View view) {
        this.view = view;
    }

    @Override
    public void clickedGrammar() {
    view.goGrammar();
    }

    @Override
    public void clickedVocabulary() {
    view.goVocabulary();
    }

    @Override
    public void clickedDictonary() {
    view.goDictonary();
    }

    @Override
    public void clickedIntroduction() {
    view.goIntroduction();
    }

    @Override
    public void clickedExist() {
        view.exist();
    }
}
