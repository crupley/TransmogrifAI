package com.salesforce.op.mdoc

import com.salesforce.op.features.types._

object DocGenerator {

  def main(args: Array[String]): Unit = {
    // build arguments for mdoc
    val settings = mdoc.MainSettings()
      .withSiteVariables(Map("VERSION" -> "1.0.0"))
      .withArgs(args.toList)
    // generate out/readme.md from working directory
    val exitCode = mdoc.Main.process(settings)
    // (optional) exit the main function with exit code 0 (success) or 1 (error)
    if (exitCode != 0) sys.exit(exitCode)
  }
}
