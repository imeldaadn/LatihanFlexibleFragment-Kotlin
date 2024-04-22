package com.imeldaaudina.latihanflexiblefragment
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class OptionDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Inflate layout untuk dialog
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_option_dialog, null)

        // Ambil referensi ke komponen-komponen dalam layout dialog
        val tvQuestionClub = view.findViewById<TextView>(R.id.tv_question_club)
        val rgOptions = view.findViewById<RadioGroup>(R.id.rg_options)
        val btnClose = view.findViewById<Button>(R.id.btn_close)
        val btnChoose = view.findViewById<Button>(R.id.btn_choose)

        // Atur teks pada TextView
        tvQuestionClub.text = getString(R.string.question_club)

        // Atur listener untuk tombol-tombol
        btnClose.setOnClickListener {
            dismiss() // Menutup dialog saat tombol close diklik
        }

        btnChoose.setOnClickListener {
            val selectedOptionId = rgOptions.checkedRadioButtonId
            // Lakukan sesuatu dengan pilihan yang dipilih...

            dismiss() // Tutup dialog setelah tindakan selesai
        }

        // Buat dialog dari layout yang telah diinflate
        return AlertDialog.Builder(requireContext())
            .setView(view)
            .create()
    }
}