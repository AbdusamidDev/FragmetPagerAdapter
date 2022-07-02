package developer.abdusamid.homework19.Fragments.First

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import developer.abdusamid.homework19.databinding.FragmentFirstThirdBinding

class FirstThirdFragment : Fragment() {
    private lateinit var binding: FragmentFirstThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstThirdBinding.inflate(layoutInflater)
        binding.childImage.setImageResource(arguments?.getInt("keys")!!)
        binding.childImage.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}