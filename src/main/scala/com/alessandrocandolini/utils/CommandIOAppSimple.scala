package com.alessandrocandolini.utils
import com.monovore.decline.effect.CommandIOApp
import com.monovore.decline.Opts
import cats.effect.IO
import cats.effect.ExitCode

abstract class CommandIOAppSimple(
                                   name: String,
                                   header: String,
                                   helpFlag: Boolean = true,
                                   version: String = ""
                                 ) extends CommandIOApp(name, header, helpFlag, version):
  def run: Opts[IO[Unit]]
  final def main: Opts[IO[ExitCode]] = run.map(_.as(ExitCode.Success))
