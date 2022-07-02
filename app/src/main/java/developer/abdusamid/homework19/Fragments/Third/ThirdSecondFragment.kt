package developer.abdusamid.homework19.Fragments.Third

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.abdusamid.homework19.Models.User3
import developer.abdusamid.homework19.databinding.FragmentThirdSecondBinding

class ThirdSecondFragment : Fragment() {
    private lateinit var binding: FragmentThirdSecondBinding
    private lateinit var user3: User3
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdSecondBinding.inflate(layoutInflater)

        binding.apply {
            name2.text = user3.name
            info2.text = user3.info
            image2.setImageResource(user3.image)
        }

        return binding.root
    }

    companion object {
        fun newInstance(user3: User3): Fragment {
            val u = ThirdSecondFragment()
            u.user3 = user3
            return u
        }
    }
}