package com.orientsec.main
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.github.barteksc.pdfviewer.util.FitPolicy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_view)
        val pdfView : PDFView = findViewById(R.id.pdfView)
        pdfView.fromAsset("sample.pdf")
            .defaultPage(0)
            .enableAnnotationRendering(true)
            .scrollHandle(DefaultScrollHandle(this))
            .spacing(10) // in dp
            .pageFitPolicy(FitPolicy.BOTH)
            .load()
    }
}