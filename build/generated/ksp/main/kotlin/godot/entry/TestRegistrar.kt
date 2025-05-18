// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.entry

import Scripts.Test
import godot.`annotation`.RegisteredClassMetadata
import godot.api.MultiplayerAPI.RPCMode.DISABLED
import godot.api.MultiplayerPeer.TransferMode.RELIABLE
import godot.core.KtConstructor0
import godot.core.KtRpcConfig
import godot.core.PropertyHint.NONE
import godot.core.VariantCaster.FLOAT
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.registration.ClassRegistrar
import godot.registration.ClassRegistry
import godot.registration.KtFunctionArgument
import kotlin.Unit
import kotlin.collections.listOf

@RegisteredClassMetadata(
  "Test",
  "Node3D",
  "Scripts.Test",
  "src/main/kotlin/scripts/test.kt",
  "gdj/Scripts/Test.gdj",
  "Game",
  "godot.api.Node3D,godot.api.Node,godot.api.Object,godot.core.KtObject,godot.common.interop.NativeWrapper,godot.common.interop.NativePointer,kotlin.Any",
  "",
  "Scripts.Test.speed",
  "Scripts.Test._ready,Scripts.Test._process",
  true,
)
public open class TestRegistrar : ClassRegistrar {
  public override fun register(registry: ClassRegistry): Unit {
    with(registry) {
      registerClass<Test>(listOf(), Test::class, false, "Node3D", "Test", "src/main/kotlin/scripts/test.kt", "gdj/Scripts/Test.gdj") {
        constructor(KtConstructor0(::Test))
        notificationFunctions(listOf())
        function(Test::_ready, NIL, KtFunctionArgument(NIL, "kotlin.Unit"), KtRpcConfig(DISABLED.id.toInt(), false, RELIABLE.id.toInt(), 0))
        function(Test::_process, NIL, DOUBLE, KtFunctionArgument(DOUBLE, "kotlin.Double", "delta"), KtFunctionArgument(NIL, "kotlin.Unit"), KtRpcConfig(DISABLED.id.toInt(), false, RELIABLE.id.toInt(), 0))
        property(Test::speed, FLOAT, DOUBLE, "kotlin.Float", NONE, "", godot.core.PropertyUsageFlags.DEFAULT.flag)
      }
    }
  }
}
