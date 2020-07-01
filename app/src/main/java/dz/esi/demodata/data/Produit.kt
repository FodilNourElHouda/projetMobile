package dz.esi.demodata.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Amine on 14/04/2018.
 */
@Entity()
data class Produit (
        @PrimaryKey() var code: String,
        @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "capital") var capital: String,
        @ColumnInfo(name = "president") var president: String,

        @ColumnInfo(name = "description") var description: String,
        @ColumnInfo(name = "population") var population: Double,
        @ColumnInfo(name = "drapeau") var drapeau: Int,

        @ColumnInfo(name = "surface") var surface: Double
){
    constructor():this("","","","","",0.0,0,0.0){

    }
}