package com.tbadhit.submissionandroidpemuladicoding.model

import com.tbadhit.submissionandroidpemuladicoding.R

object PhoneData {
    private val phoneName = arrayOf(
        "Samsung Galaxy A02s",
        "Samsung A21s",
        "Samsung Galaxy Note10+",
        "Samsung A115F Galaxy A11",
        "Samsung Galaxy A51",
        "Samsung J7 Core",
        "Samsung A71",
        "Samsung Galaxy S21 Ultra",
        "Samsung Galaxy A70",
        "Samsung Galaxy A32")

    private val phoneDetail = arrayOf(
        "OS :Android 10\nChipset :Qualcomm SDM450 Snapdragon 450 (14 nm)\nDisplay :6.5 inches\nGPU :Adreno 506",
        "OS : Android 10, One UI 2.0\nProsesor : Exynos 850 Octa core (4 x 2.0 GHz & 4 x 2.0 GHz)\nKamera Utama : Quad camera 48MP, f/2.0, 26mm (wide); 8MP, f/2.2, 123˚ (ultrawide); 2MP, f/2.4, (macro); 2 MP, f/2.4, (depth), Kamera Depan : Single 13MP, f/2.2, (wide), Autofocus\nLayar : 6.5 inci\nBaterai : 5000 mAh",
        "OS : Android 9.0, 64bit\nProsesor : S5E9825(Exynos 9825) Octa-core (2.7GHz + 2.4GHz + 1.9GHz Quad), 64 bit, 7nm processor\nKamera Utama : 12MP OIS (F1.5/F2.4 Dual Pixel, Dual Aperture), UHD, Autofocus + 16MP (F2.2) + 12MP (F2.1) + ToF (F1.4), Kamera Depan : 10MP OIS (F2.2 Dual Pixel), Autofocus\nLayar : 6.8 Inch\nBaterai : 4300 mAh",
        "OS : Android 10\nCPU: Octa-core 1.8 GHz\nKamera: Triple 13 MP, f/1.8; 5 MP, f/2.2; 2 MP, f/2.4, depan 8 MP, f/2.0\nSIM: Dual SIM (Nano-SIM)\nBaterai: Non-removable Li-Po 4000 mAh",
        "Display Size : 6.5 Inch full rectangle\nResolusi : 1080 x 2400 (FHD+), Super AMOLED\nRear Camera : 48.0 MP + 12.0 MP + 5.0 MP + 5.0 MP\nFront Camera : 32.0 MP\nProsesor : Exynos 9611, Baterai : 4000 mAh",
        "Layar: 5.5 inci Super AMOLED , 720 x 1280 Pixel\nSistem Operasi: Android v7.0 Nougat\nChipset: CPU Exynos 7870 + GPU Mali-T830MP2\nMemori: RAM : 2 GB , Internal : 16 GB , MicroSD : up to 256 GB\nKamera Belakang: 13 MP , Autofocus, LED Flash\nKamera Depan: 5 MP, LED Flash\nBaterai: Li Ion 3000 mAh Removable",
        "Display : 6.7 Inch\nProcessor : Qualcomm Snapdragon 730\nRam : 8 GB\nRom : 128 GB\nRear Camera : 64 MP + 12 MP + 5 MP + 5 MP\nFront Camera : Single 32 MP\nSupport NFC\nBattery : 4500 mAh\n25W Super Fast Charging",
        "1. Galaxy S21 Ultra 5G’s screen size is 6.8 in the full rectangle and 6.6 with accounting for the rounded corners; actual viewable area is less due to the rounded corners and camera hole.\n2. 100X Space Zoom includes 10x Optic Zoom and goes up to 100x Super Resolution Zoom. Super Resolution Zoom includes digital zoom\n3. Typical value tested under third-party laboratory condition.4855mAh",
        "Chipset : Qualcomm Snapdragon 675AIE Octa-core\nCPU : Octa-core (2x2.0 GHz Kryo 460 Gold & 6x1.7 GHz Kryo 460\nGPU : Adreno 612\nRAM (Memory) : 6 GB RAM\nStorage : 128 GB Internal Storage Micro SD Slot (up to 512 GB)\nOperating System : Android 9.0 (Pie)\nUser Interface : One UI 1.1\n",
        "Chipset :Mediatek G80\nRear Camera - Resolution (Multiple) : 48.0 MP + 8.0 MP + 5.0 MP + 2.0 MP\nKamera Depan : 20.0 MP\nBattery (mAh) : 5,000mAh (15W Fast Charging)\nFingerprint :On Screen"
    )

    private val phoneImage = intArrayOf(
        R.drawable.sm_a02s,
        R.drawable.sm_a21s,
        R.drawable.sm_note_10_plus,
        R.drawable.sm_a11,
        R.drawable.sm_a51,
        R.drawable.sm_j7_core,
        R.drawable.sm_a71,
        R.drawable.sm_s21_ultra,
        R.drawable.sm_a70,
        R.drawable.sm_a32
    )

val listData: ArrayList<Phone>
    get() {
        val list = arrayListOf<Phone>()
        for (position in phoneName.indices){
            val phone = Phone()
            phone.name = phoneName[position]
            phone.detail = phoneDetail[position]
            phone.photo = phoneImage[position]
            list.add(phone)
        }
        return list
    }


}