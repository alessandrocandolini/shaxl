package com.alessandrocandolini

import cats.effect.IO
import com.monovore.decline.Opts
import com.alessandrocandolini.cli.Args
import com.alessandrocandolini.utils.CommandIOAppSimple

object Main
    extends CommandIOAppSimple(
      name = "shaxl",
      header = "shaxl",
      version = "0.1"
    ):

  override def run: Opts[IO[Unit]] = Args.readArgs.map(program)

  val program: Args => IO[Unit] = args => IO.println(s"hello world! $args")
