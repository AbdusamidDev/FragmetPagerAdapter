package developer.abdusamid.homework19.Fragments.Third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import developer.abdusamid.homework19.Models.User3
import developer.abdusamid.homework19.Adapters.Adapter3
import developer.abdusamid.homework19.R
import developer.abdusamid.homework19.databinding.FragmentThirdFirstBinding

class ThirdFirstFragment : Fragment() {
    private lateinit var binding: FragmentThirdFirstBinding
    private var list = ArrayList<User3>()
    private var index = -1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdFirstBinding.inflate(layoutInflater)

        start()
        binding.apply {
            viewPager2.adapter = Adapter3(list, childFragmentManager)
            tabLayout2.setupWithViewPager(viewPager2)

            skip2.setOnClickListener {
                findNavController().popBackStack()
            }
            viewPager2.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
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
            next2.setOnClickListener {
                viewPager2.currentItem = ++index
            }
        }

        return binding.root
    }

    private fun start() {
        list.add(
            User3(
                "Click va Paymega o'tkazish xizmati",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.third_first
            )
        )
        list.add(
            User3(
                "Barcha operatorlar bo'yicha statistika",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.third_second
            )
        )
        list.add(
            User3(
                "Tariflarni filtrlash",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.third_third
            )
        )
        list.add(
            User3(
                "Yangi imkoniyatlar",
                "Lorem ipsum dolor sit amet, consectuter adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.third_fourth
            )
        )
    }
}