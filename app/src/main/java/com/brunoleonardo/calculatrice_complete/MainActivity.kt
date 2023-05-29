package com.brunoleonardo.calculatrice_complete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    fun actionC(view: android.view.View) {
        binding.textViewResultat.text = "" // on efface le contenu du TextView
        binding.textViewAfficherResultat.text = "" // on efface le contenu du TextView
    }

    fun actionCE(view: android.view.View) {
        var contenu = binding.textViewResultat.text.toString() // on récupère le contenu du TextView
        if (contenu.length > 0) { // si le contenu du TextView est plus grand que 0
            contenu = contenu.substring(0, contenu.length - 1) // on enlève le dernier caractère
            binding.textViewResultat.text = contenu // on affiche le nouveau contenu du TextView
        }
    }

    fun actionAdition(view: android.view.View) {
        binding.textViewResultat.text = binding.textViewResultat.text.toString() + "+"
    }

    fun actionSoustraction(view: android.view.View) {
        binding.textViewResultat.text = binding.textViewResultat.text.toString() + "-"
    }

    fun actionMultiplication(view: android.view.View) {
        binding.textViewResultat.text = binding.textViewResultat.text.toString() + "*"
    }

    fun actionDivision(view: android.view.View) {
        binding.textViewResultat.text = binding.textViewResultat.text.toString() + "/"
    }

    // fonction qui est appelée quand on clique sur le bouton =
    fun actionEgal(view: android.view.View){
        // on récupère le contenu du TextView
        var contenu = binding.textViewResultat.text.toString()
        // on initialise la variable resultat
        var resultat = 0.0
        // on vérifie si le contenu du TextView contient le caractère "+"
        if (contenu.contains("+")) {
            // on découpe le contenu du TextView en deux parties
            var tab = contenu.split("+")
            // on additionne les deux parties
            resultat = tab[0].toDouble() + tab[1].toDouble()
            // on vérifie si le contenu du TextView contient le caractère "-"
        } else if (contenu.contains("-")) {
            // on découpe le contenu du TextView en deux parties
            var tab = contenu.split("-")
            // on soustrait les deux parties
            resultat = tab[0].toDouble() - tab[1].toDouble()
            // on vérifie si le contenu du TextView contient le caractère "*"
        } else if (contenu.contains("*")) {
            // on découpe le contenu du TextView en deux parties
            var tab = contenu.split("*")
            // on multiplie les deux parties
            resultat = tab[0].toDouble() * tab[1].toDouble()
            // on vérifie si le contenu du TextView contient le caractère "/"
        } else if (contenu.contains("/")) {
            // on découpe le contenu du TextView en deux parties
            var tab = contenu.split("/")
            // on divise les deux parties
            resultat = tab[0].toDouble() / tab[1].toDouble()

        }
        // on affiche le résultat dans le TextView
        binding.textViewAfficherResultat.text = resultat.toString()
    }

}
