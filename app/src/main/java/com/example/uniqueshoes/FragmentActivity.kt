package com.example.uniqueshoes

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.uniqueshoes.bottom.BagFragment
import com.example.uniqueshoes.bottom.FavoriteFragment
import com.example.uniqueshoes.bottom.HomeFragment
import com.example.uniqueshoes.bottom.UserFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment)


        val homeFragment = HomeFragment()
        val FavoriteFragment = FavoriteFragment()
        val BagFragment = BagFragment()
        val UserFragment = UserFragment()

        makeCurrentFragment (homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_favorite -> makeCurrentFragment(FavoriteFragment)
                R.id.menu_bag -> makeCurrentFragment(BagFragment)
                R.id.menu_user -> makeCurrentFragment(UserFragment)

            }

            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}