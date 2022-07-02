package developer.abdusamid.homework19.Fragments.First

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import developer.abdusamid.homework19.Models.User1
import developer.abdusamid.homework19.Adapters.Adapter1
import developer.abdusamid.homework19.R
import developer.abdusamid.homework19.databinding.FragmentFirstFirstBinding

class FirstFirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstFirstBinding
    private lateinit var list: ArrayList<User1>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstFirstBinding.inflate(layoutInflater)

        start()

        binding.skip1.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.viewPager1.adapter = Adapter1(list, childFragmentManager)

        binding.tabLayout1.setupWithViewPager(binding.viewPager1)
        return binding.root
    }

    private fun start() {
        list = ArrayList()
        list.add(
            User1(
                "Xush kelibsiz",
                "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘",
                R.drawable.first_first
            )
        )
        list.add(
            User1(
                "Hikoyalar dunyosi",
                "Gar zamonni nayf qilsam ayb qilma, ey rafiq, Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ !",
                R.drawable.first_second
            )
        )
        list.add(
            User1(
                "Kitob ortidan...",
                "Dilrabolardin yomonliq keldi mahzun ko‘ngluma, Kelmadi jonimg'a hech oromi jondin yaxshilig'.",
                R.drawable.first_third
            )
        )
        list.add(
            User1(
                "Bizga qo`shiling",
                "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p, Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?",
                R.drawable.first_fourth
            )
        )
    }
}