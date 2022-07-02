package developer.abdusamid.homework19.Fragments.First

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import developer.abdusamid.homework19.Models.User1
import developer.abdusamid.homework19.R
import developer.abdusamid.homework19.databinding.FragmentFirstSecondBinding

class FirstSecondFragment : Fragment() {
    private lateinit var binding: FragmentFirstSecondBinding
    private lateinit var user: User1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstSecondBinding.inflate(layoutInflater)

        binding.apply {
            name1.text = user.name
            info1.text = user.info
            image1.setImageResource(user.image)
            image1.setOnClickListener {
                findNavController().navigate(
                    R.id.firstThirdFragment,
                    bundleOf("keys" to user.image)
                )
            }

            return binding.root
        }
    }

    companion object {
        fun newInstance(user: User1): Fragment {
            val f = FirstSecondFragment()
            f.user = user
            return f
        }
    }
}