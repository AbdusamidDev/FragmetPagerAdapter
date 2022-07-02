package developer.abdusamid.homework19.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import developer.abdusamid.homework19.Fragments.Third.ThirdSecondFragment
import developer.abdusamid.homework19.Models.User3

class Adapter3(var list: ArrayList<User3>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return ThirdSecondFragment.newInstance(list[position])
    }

    override fun getPageTitle(position: Int): CharSequence {
        return list[position].name
    }
}