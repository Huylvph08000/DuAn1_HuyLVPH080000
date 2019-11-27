package com.example.duan1_huylvph08000.Vocabulary;

public class VocabularyPresenter implements VocabularyMVP.Presenter {
    VocabularyMVP.View view;

    public VocabularyPresenter(VocabularyMVP.View view) {
        this.view = view;
    }

    @Override
    public void clickedTopic0() {
        view.topic0();
    }

    @Override
    public void clickedTopic1() {
    view.topic1();
    }

    @Override
    public void clickedTopic2() {
    view.topic2();
    }

    @Override
    public void clickedTopic3() {
    view.topic3();
    }

    @Override
    public void clickedTopic4() {
    view.topic4();
    }

    @Override
    public void clickedTopic5() {
    view.topic5();
    }

    @Override
    public void clickedTopic6() {
    view.topic6();
    }
}
