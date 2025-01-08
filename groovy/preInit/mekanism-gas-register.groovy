import mekanism.api.gas.GasRegistry
import mekanism.api.gas.Gas
import mekanism.common.FuelHandler
//ガスの名前や色を指定
def final valine3g_gas = new Gas("valine3g",0x9f9ea4)
//ガスを登録
GasRegistry.register(valine3g_gas);
//燃料設定を登録
FuelHandler.addGas(valine3g_gas, 2, 57729)



