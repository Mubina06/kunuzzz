package com.example.navigation


import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation.Adapter.ItemAdapter
import com.example.navigation.databinding.ActivityMainBinding
import com.example.navigation.databinding.FragmentMainBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: ItemAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList: MutableList<Items>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        itemList = mutableListOf<Items>()
        itemList.add(
            Items(
                R.drawable.img_3,
                "20:56 / 03.04.2023",
                "Петербургдаги портлашда гумонланган аёл қўлга олинди. У Ўзбекистонга учиб кетмоқчи бўлган"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_4,
                "18:08 / 03.04.2023",
                "Ўзбекистонликлар бойкот қилган «Жара» фестивали қолдирилди"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_5,
                "09:13 / 02.04.2023",
                "Z-артистларга қарши кампания, ойликлар ошиши ва пасаймаган тезлик — ҳафта дайжести"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_6,
                "20:08 / 05.04.2023",
                "Reuters: Украина қарши ҳужум учун 40 минг янги аскар тайёрламоқда"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_7,
                "19:34 / 05.04.2023",
                "Хитойнинг ЕИдаги элчиси Россия билан «чегарасиз дўстлик» ҳақидаги баёнотни «расмиятчилик» деб атади"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_8,
                "20:35 / 05.04.2023",
                "Президент фармони «Makro»даги нарх-навога ижобий таъсир қилди"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_9,
                "19:21 / 05.04.2023",
                "Марказий сайлов комиссияси референдум учун бюллетен шаклини тасдиқлади"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_10,
                "19:20 / 05.04.2023",
                "ХДП етакчиси Улуғбек Иноятов янгиланаётган Конституцияга бефарқ бўлмасликка чақирди"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_12,
                "08:15 / 04.04.2023",
                "Сергелида 3 нафар фарзанди билан ўзини 9-қаватдан пастга ташлаган аёл иши бўйича расмий маълумот берилди"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_11,
                "18:10 / 05.04.2023",
                "Бинонинг ёнғин хавфсизлиги талабларига мувофиқлиги тўғрисида хулоса ДХМ орқали берилади"
            )
        )
        itemList.add(
            Items(
                R.drawable.img_15,
                "16:45 / 05.04.2023",
                "Навоий шаҳар ҳокимлиги мансабдорларига суд ҳукми ўқилди"
            )
        )


        val binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.rv.setHasFixedSize(true)
        adapter = ItemAdapter(itemList)
        binding.rv.adapter = adapter


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}

