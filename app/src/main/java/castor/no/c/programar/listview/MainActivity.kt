package castor.no.c.programar.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var lugares = arrayOf("Tequila", "Mafialena", "Amatitán", "Arenal", "Tala", "La venta", "Guadalajara", "Santa Teresa",
        "Santa Teresa", "San Andres", "Hostotipaquillo")
    lateinit var txtItem: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtItem = findViewById(R.id.txtResultado)
        var listView : ListView = findViewById(R.id.lvLugar)
        val adaptador = ArrayAdapter(this, R.layout.list_view, lugares)
        listView.adapter = adaptador
        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val item = listView.getItemAtPosition(p2) as String
                Log.e("ListViewEvento", item)
                txtItem.text = item
            }
        }
    }
}