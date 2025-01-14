
  mods.extendedcrafting.table_crafting.shapedBuilder()
  .output(item('mekanism:energycube').withNbt(['tier': 4, 'mekData': ['energyStored': 1.7976931348623157E308D]]))
  .matrix("AAAAAAAAA",
          "ABBBBBBBA",
          "ABFHHHFBA",
          "ABHCECHBA",
          "ABHEDEHBA",
          "ABHCECHBA",
          "ABFHGHFBA",
          "ABBBBBBBA",
          "AAAAAAAAA")
  .key("A",item('mekanism:poloniumpellet'))
  .key("B",item('mekanism:plutoniumpellet'))
  .key("C",item('mekanism:antimatterpellet'))
  .key("D",item('mekanism:energycube').withNbt(['tier': 3, 'mekData': ['energyStored': 1.28E8D]]))
  .key("E",item('mekanism:controlcircuit', 4))
  .key("F",item('mekanism:cosmicalloy'))
  .key("G",item('mekanism:moduleupgrade', 24))
  .key("H",item('draconicevolution:draconic_block'))
  .tierUltimate()
  .register()

