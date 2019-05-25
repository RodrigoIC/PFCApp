package net.proyecto.pruebasproyecto.viewmodels.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import net.proyecto.pruebasproyecto.views.fragments.EntrenamientosFragment
import net.proyecto.pruebasproyecto.views.fragments.NubeFragment
import net.proyecto.pruebasproyecto.views.fragments.RutinasFragment

class PagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm)
{
    override fun getItem(position : Int): Fragment {
        return  when (position){
            0 -> {
                RutinasFragment()
            }
            1 -> {
                EntrenamientosFragment()
            }
            else -> {
                NubeFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return  when (position){
            0 -> "Rutinas"
            1 -> "Entrenamientos"
            else -> "Nube de Entrenamientos"
        }
    }
}