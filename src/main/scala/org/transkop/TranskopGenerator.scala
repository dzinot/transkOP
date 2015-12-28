package org.transkop

import org.transkop.ast.RootNode


class TranskopGenerator extends ClassLoader {

  def generate(fuckboiCode: String, filename: String): (Array[Byte], RootNode) = {
    val parser = new TranskopParser
    val rootNode = parser.parse(fuckboiCode)
    (rootNode.generateByteCode(filename), rootNode)
  }
}
