package com.example.apputsdito205411041

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
    }
    fun ARTIKEL1(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/article/598/beri-ruang-kreatifitas-utdi-gelar-festival-band-bertajuk-utdi-band-fest-semarak-kreasi-generasi-digital";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL2(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/597/mahasiswa-utdi-cetak-prestasi-di-program-mbkm-studi-independen-bersertifikat-sib";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL3(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/591/media-digital-untuk-menyalurkan-talenta-generasi-muda-utdi-dan-sman-2-yogyakarta-tandatangani-kerjasama";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL4(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/587/sman-1-pleret-bantul-gandeng-utdi-sebagai-kampus-pendamping";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL5(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/585/utdi-kembangkan-kerjasama-dengan-brin";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL6(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/584/mahasiswa-utdi-terpilih-program-bangkit-google";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL7(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/583/donor-darah-rangkaian-dies-natalis-ke-43-utdi";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL8(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/582/ln-harnaningrum-ssi-mt-lulus-fmipa-ugm-utdi-tambah-doktor-bidang-embedded-system";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL9(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/581/webinar-metaverse-for-the-universe-digelar-fti-utdi";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun ARTIKEL10(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "https://www.utdi.ac.id/site/news/579/institusi-dan-semua-program-studi-utdi-terakreditasi";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
}