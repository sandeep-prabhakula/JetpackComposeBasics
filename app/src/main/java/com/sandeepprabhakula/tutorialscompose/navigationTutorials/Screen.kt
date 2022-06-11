package com.sandeepprabhakula.tutorialscompose.navigationTutorials

const val NAV_TEST_SCREEN_ARGS = "id"
const val NAV_TEST_SCREEN_ARGS2 = "name"
const val EXPAND_CARD_SCREEN_TITLE = "title"
const val EXPAND_CARD_SCREEN_BODY = "body"

sealed class Screen(val route:String){
    object MainScreen:Screen("main_Screen")
    object DetailScreen:Screen("detail_Screen")
    object NavTestScreen:Screen("nav_test_Screen/{$NAV_TEST_SCREEN_ARGS}/{$NAV_TEST_SCREEN_ARGS2}"){
//        Single Required Arguments navigation
//        fun passID(id:Int):String{
//            return this.route.replace("{$NAV_TEST_SCREEN_ARGS}",id.toString())
//        }

//      Multiple Required Arguments
        fun passNameAndID(id:Int , name:String = "Pixel"):String{
            return "nav_test_Screen/$id/$name"
        }
    }

    object ExpandableCardScreen:Screen("expandable_card_screen/{$EXPAND_CARD_SCREEN_TITLE}/{$EXPAND_CARD_SCREEN_BODY}"){
        fun passTitleAndBody(title:String="Sandeep",body:String="Future CEO Tesla ,SpaceX ,Twitter ,NeuraLink"):String{
            return "expandable_card_screen/$title/$body"
        }
    }
}
