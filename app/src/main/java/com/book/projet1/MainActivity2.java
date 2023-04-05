package com.book.projet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView=findViewById(R.id.pdfView);
        int story_postion=getIntent().getIntExtra("key_position",0);
        if (story_postion==0) {
            pdfView.fromAsset("He walks.pdf").load();
        }
        else if (story_postion==1) {
            pdfView.fromAsset("where do I even start .pdf").load();
        }
        else if (story_postion==2) {
            pdfView.fromAsset("Love, yourself .pdf").load();
        }
        else if (story_postion==3) {
            pdfView.fromAsset("Her.pdf").load();
        }
        else if (story_postion==4) {
            pdfView.fromAsset("Venting.pdf").load();
        }
        else if (story_postion==5) {
            pdfView.fromAsset("Faceless.pdf").load();
        }
        else if (story_postion==6) {
            pdfView.fromAsset("The_diary_of_a_teen_alien.pdf").load();
        }
        else if (story_postion==7) {
            pdfView.fromAsset("She caught me staring again.pdf").load();
        }
        else if (story_postion==8) {
            pdfView.fromAsset("I'm still stunned.pdf").load();
        }
        else if (story_postion==9) {
            pdfView.fromAsset("Hope.pdf").load();
        }
        else if (story_postion==10) {
            pdfView.fromAsset("Spread fear.pdf").load();
        }
        else if (story_postion==11) {
            pdfView.fromAsset("Shattered Glass.pdf").load();
        }
        else if (story_postion==12) {
            pdfView.fromAsset("Just another one .pdf").load();
        }
        else if (story_postion==13) {
            pdfView.fromAsset("Moving mountains.pdf").load();
        }
        }

}