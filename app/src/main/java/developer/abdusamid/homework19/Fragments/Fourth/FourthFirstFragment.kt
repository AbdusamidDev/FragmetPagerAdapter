package developer.abdusamid.homework19.Fragments.Fourth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import developer.abdusamid.homework19.Models.User4
import developer.abdusamid.homework19.Adapters.Adapter4
import developer.abdusamid.homework19.R
import developer.abdusamid.homework19.databinding.FragmentFourthFirstBinding

class FourthFirstFragment : Fragment() {
    private lateinit var binding: FragmentFourthFirstBinding
    private lateinit var list: ArrayList<User4>
    private var index = -1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourthFirstBinding.inflate(layoutInflater)

        start()
        binding.apply {
            viewPager4.adapter = Adapter4(list, childFragmentManager)
            tabLayout4.attachTo(viewPager4)

            skip4.setOnClickListener {
                findNavController().popBackStack()
            }
            viewPager4.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    index = position
                }

                override fun onPageSelected(position: Int) {

                }

                override fun onPageScrollStateChanged(state: Int) {

                }
            })
            next4.setOnClickListener {
                viewPager4.currentItem = ++index
            }
        }

        return binding.root
    }

    private fun start() {
        list = ArrayList()
        list.add(
            User4(
                "Geoaxborot",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.fourth_first
            )
        )
        list.add(
            User4(
                "Huquqiy axborot",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.fourth_second
            )
        )
        list.add(
            User4(
                "To'lovlar xizmatlari",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.fourth_third
            )
        )
        list.add(
            User4(
                "Qo'shimcha imkoniyat",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.fourth_fourth
            )
        )
    }
}