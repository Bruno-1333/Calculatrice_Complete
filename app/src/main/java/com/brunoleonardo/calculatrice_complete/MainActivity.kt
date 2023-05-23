package com.brunoleonardo.calculatrice_complete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.brunoleonardo.calculatrice_complete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // le lien entre le fichier xml et l'activité

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // le lien entre le fichier xml et l'activité
        setContentView(binding.root) // le lien entre le fichier xml et l'activité


    }

    fun actionChiffres(view: android.view.View) {
        var b : Button = view as Button // on récupère le bouton qui a été cliqué
        binding.textViewResultat.text = binding.textViewResultat.text.toString() + b.text.toString()
    }
}