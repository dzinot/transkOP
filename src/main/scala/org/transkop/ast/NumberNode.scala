package org.transkop.ast

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes._
import org.transkop.SymbolTable

case class NumberNode(number: Int) extends OperandNode {
  def generate(mv: MethodVisitor, symbolTable: SymbolTable) {
    mv.visitIntInsn(SIPUSH, number)
  }
}
