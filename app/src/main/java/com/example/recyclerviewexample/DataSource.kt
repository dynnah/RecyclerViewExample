package com.example.recyclerviewexample

import com.example.recyclerviewexample.models.BlogPost

class DataSource {
    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Communication is the key to success!",
                    "body text example",
                    "https://www.pngkey.com/png/full/83-839719_banner-ultimate-esl-teaching-manual.png",
                    "Pâmella"
                )
            )
            list.add(
                BlogPost(
                    "Data Visualization!",
                    "body text example",
                    "https://image.freepik.com/vetores-gratis/design-de-banner-de-fundo-de-tecnologia-digital_1017-14297.jpg",
                    "Taysa"
                )
            )
            list.add(
                BlogPost(
                    "Cloud Computing",
                    "body text example",
                    "https://static.vecteezy.com/system/resources/previews/000/270/928/non_2x/vector-cloud-technology-web-banner.jpg",
                    "Álamo"
                )
            )
            list.add(
                BlogPost(
                    "Backend",
                    "body text example",
                    "https://img.freepik.com/free-vector/digital-technology-background-with-glowing-lines-mesh_1017-17208.jpg?size=626&ext=jpg",
                    "Dynnah"
                )
            )

            return list
        }
    }


}