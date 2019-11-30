package com.example.duan1_huylvph08000.Grammar;

public class GrammarPresenter implements GrammarMVP.Presenter {
    GrammarMVP.View view;

    public GrammarPresenter(GrammarMVP.View view) {
        this.view = view;
    }

    @Override
    public void ClickeBackhome() {
      view.backHome();
    }
}
