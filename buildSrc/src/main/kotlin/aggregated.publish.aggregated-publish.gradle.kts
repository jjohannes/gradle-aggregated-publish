import aggregated.publish.PublishingComponents

plugins {
    `maven-publish`
}
repositories {
    jcenter()
}
extensions.create<PublishingComponents>("publishingComponents", project)
