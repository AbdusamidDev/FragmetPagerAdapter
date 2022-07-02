package developer.abdusamid.homework19.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import developer.abdusamid.homework19.Fragments.Fourth.FourthSecondFragment
import developer.abdusamid.homework19.Models.User4

class Adapter4(var list: ArrayList<User4>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return FourthSecondFragment.newInstance(list[position])
    }
}