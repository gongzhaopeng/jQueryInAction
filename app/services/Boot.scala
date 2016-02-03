package services

/**
 * Created by mare on 16/2/3.
 */
case class Boot (name: String,
                 sku: String,
                 height: String,
                 lining: String,
                 colors: String,
                 price: String,
                 features: String)

object Boot {

  val bootCloset = Map(
    "7141832" ->
      Boot(
        "Chippewa 17-inch Engineer Boot",
        "7141832",
        "17 inches",
        "Leather",
        "Black Oil-tanned, Black Polishable",
        "$187.00",
        "Oil-tanned or polishable full-grain leather uppers. Vibram sole. Goodyear welt. Padded insole. Steel safety toe."
      ),
    "7173656" ->
      Boot(
        "Chippewa 11-inch Engineer Boot",
        "7173656",
        "11 inches",
        "None",
        "Black, Crazy Horse",
        "$167.00",
        "Oil-tanned full-grain leather uppers. Vibram sole. Goodyear welt. Padded insole. Steel safety toe. Texon&reg; insole."
      ),
    "7141922" ->
      Boot(
        "Chippewa Harness Boot",
        "7141922",
        "13 inches",
        "Leather",
        "Black, Crazy Horse",
        "$187.00",
        "Full-grain leather uppers. Leather lining. Vibram sole. Goodyear welt."
      ),
    "7177382" ->
      Boot(
        "Caterpillar Tradesman Work Boot",
        "7177382",
        "6 inches",
        "Leather",
        "Honey, Peanut",
        "$87.00",
        "Full-grain oil-tanned leather. Nylon mesh lining. Ortholite sock liner. EVA midsole. T84V Rubberlon outsole."
      ),
    "7141730" ->
      Boot(
        "Danner Foreman Pro Work Boot",
        "7141730",
        "10 inches",
        "Leather",
        "Honey, Brown",
        "$287.00",
        "Alkali-resistant full-grain leather. Cambrelle nylon lining. Fiberglass shank. Vibram 4014 Cristy sole. Stitch-down construction."
      ),
    "7141833" ->
      Boot(
        "Chippewa 17-inch Snakeproof Boot",
        "7141833",
        "17 inches",
        "Leather",
        "Russet",
        "$147.00",
        "Full-grain leather foot. 1000 Denier Cordura Viper cloth shaft. Goodyear welt. Leather Lining. Body Cushion Insole. Vibram Robinson Outsole."
      ),
    "7257914" ->
      Boot(
        "Danner Grouse GTX Boot",
        "7257914",
        "8 inches",
        "Gore-Tex",
        "Brown",
        "$207.00",
        "Full-grain leather foot. 1000 Denier Cordura Viper cloth shaft. Gore-Tex lining. Stich-down construction."
      ),
    "7269643" ->
      Boot(
        "Caterpillar Logger Boot",
        "7269643",
        "8 inches",
        "Cambrelle",
        "Black",
        "$157.00",
        "Full-grain leather. Cambrelle&reg; lining. Steel safety toe. Electrical hazard protection. Poliyou&reg; cushion insole. Rubber lug outsole."
      ),
    "7332058" ->
      Boot(
        "Chippewa 9-inch Briar Waterproof Bison Boot",
        "7332058",
        "9 inches",
        "Chip-A-Tex&reg; waterproof",
        "tan/brown/amber",
        "$138.00",
        "Amber shark skin tip leather. Chip-A-Tex&reg; waterproof bootie. Vibram long haul outsole. Steel shank. Black nickle non-tarnishable hardware. Heavy duty stay-tied laces. Removable cushion orthotic. Non-insulated."
      )
  )

  def find(model: String) = {

    bootCloset(model)
  }
}
