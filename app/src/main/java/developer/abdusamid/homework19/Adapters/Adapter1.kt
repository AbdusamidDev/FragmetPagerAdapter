package developer.abdusamid.homework19.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import developer.abdusamid.homework19.Fragments.First.FirstSecondFragment
import developer.abdusamid.homework19.Models.User1

class Adapter1(var list: ArrayList<User1>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return FirstSecondFragment.newInstance(list[position])
    }

    override fun getPageTitle(position: Int): CharSequence {
        return list[position].name
    }
}