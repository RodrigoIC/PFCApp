package net.proyecto.pruebasproyecto.views

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.proyecto.pruebasproyecto.R

class NubeFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        return inflater!!.inflate(R.layout.fragment_nube, container, false)
    }
}