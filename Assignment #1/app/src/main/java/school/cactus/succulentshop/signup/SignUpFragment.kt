package school.cactus.succulentshop.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout
import school.cactus.succulentshop.R
import school.cactus.succulentshop.databinding.FragmentSignUpBinding
import school.cactus.succulentshop.signup.validation.SignUpEmailValidator
import school.cactus.succulentshop.signup.validation.SignUpPasswordValidator
import school.cactus.succulentshop.signup.validation.SignUpUsernameValidator

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null

    private val binding get() = _binding!!

    private val signUpEmailValidator = SignUpEmailValidator()
    private val signUpPasswordValidator = SignUpPasswordValidator()
    private val signUpUsernameValidator = SignUpUsernameValidator()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            signUpButton.setOnClickListener {
                if (emailInputLayout.isValid() and passwordInputLayout.isValid()
                    and usernameInputLayout.isValid()) {
                    findNavController().navigate(R.id.action_signUpFragment_to_productListFragment)
                }
            }
            alreadyHaveAccountButton.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        requireActivity().title = getString(R.string.app_name)
    }

    private fun TextInputLayout.isValid(): Boolean {
        val errorMessage = validator().validate(editText!!.text.toString())
        error = errorMessage?.resolveAsString()
        isErrorEnabled = errorMessage != null
        return errorMessage == null
    }

    private fun Int.resolveAsString() = getString(this)

    private fun TextInputLayout.validator() = when (this) {
        binding.emailInputLayout -> signUpEmailValidator
        binding.passwordInputLayout -> signUpPasswordValidator
        binding.usernameInputLayout -> signUpUsernameValidator
        else -> throw IllegalArgumentException("Cannot find any validator for the given TextInputLayout")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}