package ru.d3st.boombarrier.detail

import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentAddBarrier : BottomSheetDialogFragment() {

    private val viewmodel : BarrierDialogViewModel by viewModels()

    private enum class EditingBarrier{
        NEW_BARRIER,
        EXISTING_BARRIER
    }

}