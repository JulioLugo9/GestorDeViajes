package mx.itesm.noobmasters.gestordeviajes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.itesm.noobmasters.gestordeviajes.ui.crearevento.CrearEventoFragment

class CrearEventoActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crear_evento_activity)
        val viaje_a = intent.getStringExtra("ubicacion_key")
        Toast.makeText(this, viaje_a, Toast.LENGTH_SHORT).show()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CrearEventoFragment.newInstance())
                .commitNow()
        }


        //Esconde el titulo de la app
        supportActionBar?.hide()
    }
}