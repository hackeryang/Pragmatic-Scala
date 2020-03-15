package ProgrammingActors

import akka.actor._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object CreateActors extends App {
  val system = ActorSystem("sample") //括号内为线程池的名称
  val depp = system.actorOf(Props[HollywoodActor])
  val hanks = system.actorOf(Props[HollywoodActor])

  depp ! "Wonka"
  hanks ! "Gump"

  depp ! "Sparrow"
  hanks ! "Phillips"
  println(s"Calling from ${Thread.currentThread}")

  val terminateFuture = system.terminate()
  Await.ready(terminateFuture, Duration.Inf)
}
