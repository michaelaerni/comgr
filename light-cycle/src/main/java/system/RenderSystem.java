package system;

import ch.fhnw.ether.render.IRenderManager;
import event.Event;

public class RenderSystem extends System {

    private final IRenderManager renderManager;

    public RenderSystem(IRenderManager renderManager) {
        this.renderManager = renderManager;
    }

    @Override
    public void process(float deltaTime) {
        this.renderManager.update();
    }

    @Override
    public void receive(Event event) {

    }
}