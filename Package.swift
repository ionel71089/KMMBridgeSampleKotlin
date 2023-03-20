// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/ionel71089/KMMBridgeSampleKotlin/KMMBridgeSampleKotlin/shared-kmmbridge/0.8.5-alpha.2/shared-kmmbridge-0.8.5-alpha.2.zip"
let remoteKotlinChecksum = "6b121a1926edb5798695608698a43276f76c71599c19cd0323958b4a80caf47d"
let packageName = "shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)