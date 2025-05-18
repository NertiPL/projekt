package Scripts

import godot.annotation.Export
import godot.core.Vector3
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.api.Input
import godot.api.Node3D
import godot.core.Key


@RegisterClass
class Test: Node3D() {

	@RegisterProperty
	@Export var speed: Float = 8.0F


	@RegisterFunction
	override fun _ready() {
	}

	@RegisterFunction
	override fun _process(delta: Double) {
		var direction = Vector3()

		if(Input.isKeyPressed(Key.W)) direction.z -= 1
		if(Input.isKeyPressed(Key.S)) direction.z += 1
		if(Input.isKeyPressed(Key.A)) direction.x -= 1
		if(Input.isKeyPressed(Key.D)) direction.x += 1

		if(direction != Vector3.ZERO){
			direction = direction.normalized()
			translate(direction * speed * delta)
		}
	}
}
