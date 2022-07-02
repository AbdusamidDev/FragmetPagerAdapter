package developer.abdusamid.homework19.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import developer.abdusamid.homework19.R
import developer.abdusamid.homework19.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.apply {
            home12.setOnClickListener {
                findNavController().navigate(R.id.firstFirstFragment)
            }
            home3.setOnClickListener {
                findNavController().navigate(R.id.thirdFirstFragment)
            }
            home4.setOnClickListener {
                findNavController().navigate(R.id.fourthFirstFragment)
            }
        }
        return binding.root
    }
}