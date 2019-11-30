package com.example.duan1_huylvph08000.Home;

public interface HomeMVP {
    interface View{
        void goGrammar();
        void goVocabulary();
        void goDictonary();
        void goIntroduction();
        void exist();
    }
    interface Presenter{
        void clickedGrammar();
        void clickedVocabulary();
        void clickedDictonary();
        void clickedIntroduction();
        void clickedExist();
    }
}
