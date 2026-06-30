package com.kidssleep.engine

import com.kidssleep.domain.model.Story
import com.kidssleep.domain.model.StoryCategory

object SleepStoryBank {

    val all: List<Story> = listOf(
        story(
            id = 1,
            title = "The Sleepy Moon",
            category = StoryCategory.BEDTIME,
            illustration = "🌙",
            lines = listOf(
                "The moon smiled softly over the quiet town.",
                "Stars blinked like tiny night-lights in the sky.",
                "A little rabbit tucked her paws under a warm blanket.",
                "The wind hummed a gentle lullaby through the trees.",
                "Clouds drifted slowly like fluffy pillows.",
                "Every house grew still and peaceful.",
                "The moon whispered, \"Rest now, little one.\"",
                "And the whole world fell into a calm, happy sleep."
            )
        ),
        story(
            id = 2,
            title = "The Cozy Cloud",
            category = StoryCategory.BEDTIME,
            illustration = "☁️",
            lines = listOf(
                "A fluffy cloud floated down from the sky.",
                "It found a tired kitten yawning by the window.",
                "\"Climb aboard,\" said the cloud with a smile.",
                "The kitten curled up on the softest seat ever.",
                "They sailed past sleeping birds and quiet hills.",
                "The cloud rocked gently like a cradle.",
                "The kitten's eyes grew heavy and happy.",
                "Together they dreamed of sunny meadows."
            )
        ),
        story(
            id = 3,
            title = "The Star Blanket",
            category = StoryCategory.BEDTIME,
            illustration = "⭐",
            lines = listOf(
                "Grandma spread a blanket made of starlight.",
                "Each star glowed with a soft, warm light.",
                "A little bear snuggled underneath it.",
                "The stars told quiet stories about faraway places.",
                "One star sang about a peaceful river.",
                "Another star hummed about a gentle breeze.",
                "The bear felt safe, warm, and loved.",
                "Soon the star blanket rocked him to sleep."
            )
        ),
        story(
            id = 4,
            title = "The Quiet Forest",
            category = StoryCategory.BEDTIME,
            illustration = "🌲",
            lines = listOf(
                "Deep in the forest, the day turned to dusk.",
                "Fireflies lit tiny lanterns among the leaves.",
                "An owl said hello with a soft, kind hoot.",
                "The stream bubbled quietly over smooth stones.",
                "Flowers closed their petals for the night.",
                "A deer lay down on a bed of moss.",
                "The forest breathed slowly in and out.",
                "Everything felt safe, still, and ready to rest."
            )
        ),
        story(
            id = 5,
            title = "The Gentle Wave",
            category = StoryCategory.BEDTIME,
            illustration = "🌊",
            lines = listOf(
                "The ocean sang a slow song to the shore.",
                "Waves rolled in and whispered goodnight.",
                "A small boat rocked softly on the water.",
                "Seashells rested on the warm sand.",
                "A dolphin dreamed beneath the calm sea.",
                "The lighthouse blinked once, then grew quiet.",
                "The beach grew peaceful and still.",
                "The ocean kept singing until morning."
            )
        ),
        story(
            id = 6,
            title = "The Sleepy Train",
            category = StoryCategory.BEDTIME,
            illustration = "🚂",
            lines = listOf(
                "A little train chugged through the evening.",
                "Its wheels went clickety-clack, soft and slow.",
                "Passengers yawned and pulled up their blankets.",
                "The conductor turned down the lights one by one.",
                "Fields and farms passed by in the twilight.",
                "The train hooted a gentle goodnight.",
                "Clickety-clack became quieter and quieter.",
                "Everyone rode happily into dreamland."
            )
        ),
        story(
            id = 7,
            title = "The Night Garden",
            category = StoryCategory.BEDTIME,
            illustration = "🌸",
            lines = listOf(
                "In a small garden, flowers folded their petals.",
                "A ladybug found a leaf to rest upon.",
                "The watering can sat still by the fence.",
                "Crickets played a soft evening song.",
                "The moonlight painted silver on the path.",
                "A butterfly slept under a big green leaf.",
                "The garden smelled sweet and calm.",
                "Night wrapped the garden like a cozy hug."
            )
        ),
        story(
            id = 8,
            title = "The Teddy's Dream",
            category = StoryCategory.BEDTIME,
            illustration = "🧸",
            lines = listOf(
                "A teddy bear waited on a child's bed.",
                "The room grew quiet as the lamp went dim.",
                "Teddy held a tiny pillow close.",
                "He thought about castles made of clouds.",
                "He thought about friends who love to hug.",
                "The clock ticked softly on the wall.",
                "Teddy's stitched smile felt warm and kind.",
                "He closed his button eyes and dreamed sweet dreams."
            )
        ),
        story(
            id = 9,
            title = "The Sleepy Kite",
            category = StoryCategory.BEDTIME,
            illustration = "🪁",
            lines = listOf(
                "A colorful kite floated down from the sky.",
                "The wind had grown tired and slow.",
                "The kite landed softly on green grass.",
                "A puppy watched it with sleepy eyes.",
                "The kite folded its tail like a blanket.",
                "Stars began to peek above the hill.",
                "The puppy yawned and lay beside the kite.",
                "They rested together until morning light."
            )
        ),
        story(
            id = 10,
            title = "The Kind Night",
            category = StoryCategory.BEDTIME,
            illustration = "🦉",
            lines = listOf(
                "An owl watched over the neighborhood.",
                "Lights went out one window at a time.",
                "A cat stretched and found a warm spot.",
                "The street grew quiet and peaceful.",
                "The owl blinked slowly in the moonlight.",
                "He kept a gentle watch while children slept.",
                "No scary sounds, only soft night air.",
                "Everyone felt safe beneath the kind night sky."
            )
        ),
        story(
            id = 11,
            title = "The Dream Boat",
            category = StoryCategory.BEDTIME,
            illustration = "⛵",
            lines = listOf(
                "A paper boat sailed on a still pond.",
                "Moonlight made a silver path on the water.",
                "Tiny fish swam slowly underneath.",
                "Reeds swayed like sleepy dancers.",
                "The boat drifted without a hurry.",
                "A frog croaked once, then rested.",
                "The pond mirrored the calm night sky.",
                "The boat sailed on into quiet dreams."
            )
        ),
        story(
            id = 12,
            title = "Goodnight, Little One",
            category = StoryCategory.BEDTIME,
            illustration = "💤",
            lines = listOf(
                "Your day was full of play and smiles.",
                "Now your body is ready to rest.",
                "Take a slow, deep breath in and out.",
                "Let your shoulders melt into the bed.",
                "Think of something that makes you happy.",
                "The room is warm, safe, and still.",
                "Tomorrow will bring new adventures.",
                "Goodnight, little one. Sweet dreams."
            )
        ),
    )

    fun byId(id: Int): Story? = all.firstOrNull { it.id == id }

    private fun story(
        id: Int,
        title: String,
        category: StoryCategory,
        illustration: String,
        lines: List<String>
    ): Story = Story(id = id, title = title, category = category, illustration = illustration, lines = lines)
}
