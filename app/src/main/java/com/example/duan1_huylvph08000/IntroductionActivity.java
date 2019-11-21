package com.example.duan1_huylvph08000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntroductionActivity extends AppCompatActivity {
public String Caption = "Enghish Learning";
public String text2 = "- Enghish Learning là một phần mềm học tiếng Anh giúp cải thiện khả năng ghi nhớ từ vựng.";
public String text4 = "-Đây là phần mềm giúp rèn luyện kỹ năng nghe một cách hoàn thiện hơn. Ứng dụng này có đầy đủ những đoạn hội thoại từ cơ bản đến nâng cao.\n" +
        "Ứng dụng này hỗ trợ bạn học tiếng Anh hiệu quả thông qua các chủ đề ngữ pháp có giải thích rõ ràng, giúp học ngữ pháp nhanh và thú vị.\n";
TextView txtCaption, txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        setTitle("Introduction about app");
        txtCaption = findViewById(R.id.txtCaption);
        txtCaption.setText(Caption);

    }
}
