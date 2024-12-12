package org.http4k.client

import org.http4k.core.BodyMode
import org.http4k.core.HttpHandler
import org.http4k.server.ServerConfig
import org.http4k.server.SunHttp
import org.http4k.streaming.StreamingContract

class NettyClientStreamingTest : StreamingContract() {
    override fun serverConfig(): ServerConfig = SunHttp(0)

    override fun createClient(): HttpHandler = NettyHttpClient(bodyMode = BodyMode.Stream)
}
