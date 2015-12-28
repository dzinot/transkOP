package org.transkop.ast

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes._
import org.transkop.SymbolTable

case class VariableNode(variableName: String) extends OperandNode{
  def generate(mv: MethodVisitor, symbolTable: SymbolTable) {
    mv.visitVarInsn(ILOAD, symbolTable.getVariableAddress(variableName))
  }
}
