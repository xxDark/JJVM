package me.xdark.vrtvm.interpreter;

import me.xdark.vrtvm.VMContext;
import org.objectweb.asm.tree.AbstractInsnNode;

public final class FloatConstantHandler implements InstructionInterpreter<AbstractInsnNode> {
    @Override
    public void process(VMContext ctx, AbstractInsnNode insn) {
        ctx.stack.push(ctx.vm.newFloat(insn.getOpcode() - 11));
    }
}
